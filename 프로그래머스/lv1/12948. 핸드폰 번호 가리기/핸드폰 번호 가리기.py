def solution(phone_number):

    result = ""
    for i in range(len(phone_number)-4):
        result += '*'
    result += phone_number[-4:]

    return result