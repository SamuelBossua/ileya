def get_repeated_values(array):

    repeated_numbers = []

    for count in range(len(array)):

        repeated_num = False

        for count_two in range(count + 1, len(array)):

            if array[count] == array[count_two]:
                repeated_num = True
                break

        already_added = False

        for count_three in range(count):

            if array[count_three] == array[count]:
                already_added = True
                break

        if repeated_num and not already_added:
            repeated_numbers.append(array[count])

    return repeated_numbers


def get_repeated_values_and_indexes(array):

    result = []

    for count in range(len(array)):

        repeated_num = False
        second_index = 0

        for count_two in range(count + 1, len(array)):

            if array[count] == array[count_two]:
                repeated_num = True
                second_index = count_two
                break

        already_added = False

        for count_three in range(count):

            if array[count_three] == array[count]:
                already_added = True
                break

        if repeated_num and not already_added:
            result.append([array[count], count, second_index])

    return result


def move_zeros_to_end(array):

    result = []

    for number in array:

        if number != 0:
            result.append(number)

    for number in array:

        if number == 0:
            result.append(0)

    return result