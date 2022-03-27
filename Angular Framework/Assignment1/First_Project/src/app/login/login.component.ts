import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { RestoService } from '../resto.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user:string = '';
  password:string = '';

  constructor(private resto: RestoService, private router: Router) { }

  ngOnInit(): void {
  }

  logit(){
    if(this.user == "abc@admin.com" && this.password == "qwert123"){
      this.router.navigateByUrl("/list");
    }
    else{
      alert("Enter the right admin username & password!");
    }
  }

}
