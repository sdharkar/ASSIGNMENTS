const json = '{"first":"Narendra", "last":"Modi"}';
const name = eval('('+json+')' );

console.log(name.first);
console.log(name.last);