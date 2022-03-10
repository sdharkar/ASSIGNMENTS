class Person{
    constructor(first, middle, last){
        this.first = first;
        this.middle = middle;
        this.last = last;
    }
}

var per1 = new Person("Shrirang", "Sachin","Dharkar");
console.log(per1.first+" "+per1.middle+" "+per1.last);

var per2 = new Person("Samsung", "S22 Ultra");
per2.middle = "Galaxy";
per2.last = "S22 Ultra";
console.log(per2.first+" "+per2.middle+" "+per2.last);