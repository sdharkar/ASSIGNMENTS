import { Component, OnInit } from '@angular/core';
import { NgModule } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { RestoService } from '../resto.service';

@Component({
  selector: 'app-list-menu',
  templateUrl: './list-menu.component.html',
  styleUrls: ['./list-menu.component.css']
})
export class ListMenuComponent implements OnInit {

  constructor(private resto:RestoService) { }

  alert:boolean = false;

  addmenu = new FormGroup({
    item: new FormControl(''),
    price: new FormControl('')
  })

  ngOnInit(): void {
  }

  collectMenu()
  {
    console.warn("yes");
  }

}
