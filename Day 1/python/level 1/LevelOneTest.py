from level_one import *


def test_array_splitter():

    array = [1, 2, 3, 4, 5, 6]

    expected = [[2, 4, 6], [1, 3, 5]]

    actual = array_splitter(array)

    assert actual == expected


def test_palindromic_array():

    array = [45, 0, 8, 0, 45]

    expected = True

    actual = palindromic_array(array)

    assert actual == expected


def test_get_perfect_square():

    array = [4, 7, 9, 10, 16, 18]

    expected = [4, 9, 16]

    actual = get_perfect_square(array)

    assert actual == expected


def test_replace_non_perfect_square():

    array = [4, 7, 9, 10, 16, 18]

    expected = [4, -1, 9, -1, 16, -1]

    actual = replace_non_perfect_square(array)

    assert actual == expected