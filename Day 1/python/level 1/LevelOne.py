def array_splitter(array):

    even_numbers = []
    odd_numbers = []

    for number in array:

        if number % 2 == 0:
            even_numbers.append(number)

        else:
            odd_numbers.append(number)

    return [even_numbers, odd_numbers]


def palindromic_array(array):

    for count in range(len(array) // 2):

        if array[count] != array[len(array) - 1 - count]:
            return False

    return True


def get_perfect_square(array):

    perfect_squares = []

    for number in array:

        root = int(number ** 0.5)

        if root * root == number:
            perfect_squares.append(number)

    return perfect_squares


def replace_non_perfect_square(array):

    result = []

    for number in array:

        root = int(number ** 0.5)

        if root * root == number:
            result.append(number)

        else:
            result.append(-1)

    return result