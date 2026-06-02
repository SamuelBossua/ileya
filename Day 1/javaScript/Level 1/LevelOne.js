function arraySplitter(array){

    let evenNumbers = [];
    let oddNumbers = [];

    for(let number of array){

        if(number % 2 === 0){
            evenNumbers.push(number);
        }

        else{
            oddNumbers.push(number);
        }
    }

    return [evenNumbers, oddNumbers];
}


function palindromicArray(array){

    for(let count = 0; count < array.length / 2; count++){

        if(array[count] !== array[array.length - 1 - count]){
            return false;
        }
    }

    return true;
}


function getPerfectSquare(array){

    let perfectSquares = [];

    for(let number of array){

        let root = Math.floor(Math.sqrt(number));

        if(root * root === number){
            perfectSquares.push(number);
        }
    }

    return perfectSquares;
}


function replaceNonPerfectSquare(array){

    let result = [];

    for(let number of array){

        let root = Math.floor(Math.sqrt(number));

        if(root * root === number){
            result.push(number);
        }

        else{
            result.push(-1);
        }
    }

    return result;
}


module.exports = {
    arraySplitter,
    palindromicArray,
    getPerfectSquare,
    replaceNonPerfectSquare
};