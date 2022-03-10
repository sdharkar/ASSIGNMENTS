function concatenate(){
    const letters = ["a", "b", "c"];
    const numbers = [1,2,3];

    document.write(letters+"\n\n");
    document.write(numbers+"\n\n");

    const alphaNum = letters.concat(numbers);
    console.log(alphaNum);
    document.write(alphaNum)

}

console.log(concatenate());