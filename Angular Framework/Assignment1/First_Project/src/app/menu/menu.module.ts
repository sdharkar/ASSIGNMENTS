import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { ListMenuComponent } from '../list-menu/list-menu.component';


@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    ListMenuComponent
  ],
  exports:[
    CommonModule,
    FormsModule,
    ReactiveFormsModule,
    ListMenuComponent
  ]
})
export class MenuModule { }
