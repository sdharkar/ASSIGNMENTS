class rectangle{
    constructor(width, height){
        this.width = width;
        this.height = height;
    }
}

rectangle.prototype.getArea = function(){
    var AreaH = this.height;
    var AreaW = this.width;

    var ans = AreaH * AreaW;

    return "Area is:"+ans;
}

myRectangle = new rectangle(10,5);
console.log(myRectangle.width + " "+ myRectangle.height);

console.log(myRectangle.getArea());

myRec = new rectangle(13,7);
console.log(myRec.width+" "+myRec.height);
console.log(myRec.getArea());

myRec2 = new rectangle(4,5);
console.log(myRec2.width+" "+myRec2.height);
console.log(myRec2.getArea());
