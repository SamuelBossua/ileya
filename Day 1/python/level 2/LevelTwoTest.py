from level_two import *


def test_get_repeated_values():

    array = [1, 2, 3, 2, 4, 3]

    expected = [2, 3]

    actual = get_repeated_values(array)

    assert actual == expected


def test_get_repeated_values_and_indexes():

    array = [-11, -9, 3, -9, 2, -11]

    expected = [[-11, 0, 5], [-9, 1, 3]]

    actual = get_repeated_values_and_indexes(array)

    assert actual == expected


def test_move_zeros_to_end():

    array = [5, 0, 3, 0, 2, 0]

    expected = [5, 3, 2, 0, 0, 0]

    actual = move_zeros_to_end(array)

    assert actual == expected