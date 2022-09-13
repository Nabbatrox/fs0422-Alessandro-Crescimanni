import { Component, ElementRef, OnInit, ViewChild } from '@angular/core';
import { NgForm, NgModel } from '@angular/forms';

@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {

  //@ViewChild('form') form!:NgModel; //grazie a questa prop posso raggiungere il riferimento al form da qualunque punto della classe

  constructor() { }

  ngOnInit(): void {


  }

  checkValidity(field:NgModel){
    return field.invalid && field.touched && field.dirty
  }

  submit(form:NgForm){
    console.log(form.value)
  }
}