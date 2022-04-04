import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Transaction } from '../Transaction/Transaction';

@Injectable({
  providedIn: 'root'
})
export class TransactionService {

  private baseUrl="http://localhost:8090/transaction";

  constructor(private http:HttpClient) { }

  public listAllTransaction()
  {
    console.log(this.http.get<Transaction[]>(this.baseUrl+'/transactions'));

    return this.http.get<Transaction[]>(this.baseUrl+'/transactions');
  }

  public getTransactionById(id:number)  {
    console.log(this.http.get<any>(this.baseUrl+'/transactionId/'+id));

    return this.http.get<any>(this.baseUrl+'/transactionId/'+id);
  }

  public createTransaction(t:Transaction)
  {
     return this.http.post(this.baseUrl+'/addtransaction',t);
  }
}
