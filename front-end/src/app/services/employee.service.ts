import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { environment } from 'src/environments/environment';
import { Observable } from 'rxjs';
import { Employee } from '../modules/employee';

@Injectable({
  providedIn: 'root'
})
export class EmployeeService {

  private url: string = `${environment.api}/employee`;

  constructor(private httpClient: HttpClient) { }

  public getEmployees(): Observable<Employee[]> {
    return this.httpClient.get<Employee[]>(`${this.url}/all`);
  }

  public addEmployees(employee: Employee): Observable<Employee> {
    return this.httpClient.post<Employee>(`${this.url}/add`, employee);
  }

  public deleteEmployees(employeeId: number): Observable<void> {
    return this.httpClient.delete<void>(`${this.url}/delete/${employeeId}`);
  }
}
