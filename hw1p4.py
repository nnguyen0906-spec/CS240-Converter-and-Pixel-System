# Write a program that reads an image and prints its pixel values.
from PIL import Image
    
def convert(color):
    if color == "R": return (237,28,36)
    elif color == "B": return (0,0,0)
    elif color == "Y": return (255,242,0)
    else: return color


input_text_file = open("input.txt", "r")
lines = input_text_file.readlines()
width, height = len(lines[0].split()), len(lines)
output_image_file = Image.new("RGB", (width, height))


for y in range(height):
    line = lines[y]
    pixels = line.split()
    for x in range(width):
        pixel = pixels[x]
        pixel = convert(pixel)
        output_image_file.putpixel((x, y), pixel)

output_image_file.save("output.png")
input_text_file.close()
output_image_file.close()


