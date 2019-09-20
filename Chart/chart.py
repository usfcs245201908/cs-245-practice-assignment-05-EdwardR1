import matplotlib.pyplot as plt
def parse(fileName):
    values={"Insertion": [], "Merge": [], "Quick": [], "Size": []}
    r = open(fileName, "r")
    for line in r:
        (insertion, merge, quick, size) = line.split(",")
        if(parseInt(insertion) != -1):
            values["Insertion"].append(parseInt(insertion))
        if(parseInt(merge) != -1):
            values["Merge"].append(parseInt(merge))
        if(parseInt(quick) != -1):
            values["Quick"].append(parseInt(quick))
        if(parseInt(size) != -1):
            values["Size"].append(parseInt(size))
    return values
        
def parseInt(string):
    try:
        return int(string)
    except ValueError:
        return -1

def graph():
    values = parse("Chart/data.csv")
    x = values["Size"]

    y1 = values["Insertion"]

    y2 = values["Merge"]

    y3 = values["Quick"]

    plt.plot(x, y1, label="Insertion Sort", color="red")
    plt.plot(x, y2, label="Merge Sort")
    plt.plot(x, y3, label="Quick Sort")

    plt.xlabel("Array Size")
    plt.ylabel("Time (ms)")
    plt.xlim(50000, 500000)
    plt.ylim(0, 22000)
    plt.xticks([100000, 200000, 300000, 400000, 500000])
    plt.grid(linestyle="-", linewidth=0.5)

    plt.title("Running time of each sorting algorithm")

    plt.legend()

    plt.show()


def main():
    graph()

main()