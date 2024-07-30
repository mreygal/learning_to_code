def reversed_words(sentence):
    words = sentence.split()
    reversed = words[::-1]
    return ' '.join(reversed)

print(reversed_words("Hello my name is Mauricio"))