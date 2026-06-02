function getRepeatedValues(array){

    let repeatedNumbers = [];

    for(let count = 0; count < array.length; count++){

        let repeatedNum = false;

        for(let countTwo = count + 1; countTwo < array.length; countTwo++){

            if(array[count] === array[countTwo]){
                repeatedNum = true;
                break;
            }
        }

        let alreadyAdded = false;

        for(let countThree = 0; countThree < count; countThree++){

            if(array[countThree] === array[count]){
                alreadyAdded = true;
                break;
            }
        }

        if(repeatedNum && !alreadyAdded){
            repeatedNumbers.push(array[count]);
        }
    }

    return repeatedNumbers;
}


function getRepeatedValuesAndIndexes(array){

    let result = [];

    for(let count = 0; count < array.length; count++){

        let repeatedNum = false;
        let secondIndex = 0;

        for(let countTwo = count + 1; countTwo < array.length; countTwo++){

            if(array[count] === array[countTwo]){
                repeatedNum = true;
                secondIndex = countTwo;
                break;
            }
        }

        let alreadyAdded = false;

        for(let countThree = 0; countThree < count; countThree++){

            if(array[countThree] === array[count]){
                alreadyAdded = true;
                break;
            }
        }

        if(repeatedNum && !alreadyAdded){
            result.push([array[count], count, secondIndex]);
        }
    }

    return result;
}


function moveZerosToEnd(array){

    let result = [];

    for(let number of array){

        if(number !== 0){
            result.push(number);
        }
    }

    for(let number of array){

        if(number === 0){
            result.push(0);
        }
    }

    return result;
}


module.exports = {
    getRepeatedValues,
    getRepeatedValuesAndIndexes,
    moveZerosToEnd
};