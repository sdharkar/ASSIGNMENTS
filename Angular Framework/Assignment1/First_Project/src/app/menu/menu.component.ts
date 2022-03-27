import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';

@Component({
  selector: 'app-menu',
  templateUrl: './menu.component.html',
  styleUrls: ['./menu.component.css']
})
export class MenuComponent implements OnInit {

  alert:boolean = false;

  addmenu = new FormGroup({
    item: new FormControl(''),
    price: new FormControl('')
  })

  constructor() { }

  ngOnInit(): void {
  }

  collectMenu(){
    console.log(this.addmenu.value);
  }

}
