import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-deposits',
  templateUrl: './deposits.component.html',
  styleUrls: ['./deposits.component.css']
})
export class DepositsComponent implements OnInit {
  tenureVals!: Array<Number>;
  constructor() { }

  ngOnInit(): void {
    this.tenureVals = [1,2,3,4,5,6,7,8,9,10]
  }

}
