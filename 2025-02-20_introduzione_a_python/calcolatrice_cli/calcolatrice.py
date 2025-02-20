import argparse

def add(x, y):
    return x + y

def subtract(x, y):
    return x - y

def multiply(x, y):
    return x * y

def divide(x, y):
    if y == 0:
        return "Errore: divisione per zero"
    return x / y

def main():
    parser = argparse.ArgumentParser(description="Un'applicazione per eseguire operazioni matematiche di base.")
    parser.add_argument("operation", choices=["add", "subtract", "multiply", "divide"], help="L'operazione da eseguire")
    parser.add_argument("x", type=float, help="Il primo numero")
    parser.add_argument("y", type=float, help="Il secondo numero")

    args = parser.parse_args()

    if args.operation == "add":
        print(f"{args.x} + {args.y} = {add(args.x, args.y)}")
    elif args.operation == "subtract":
        print(f"{args.x} - {args.y} = {subtract(args.x, args.y)}")
    elif args.operation == "multiply":
        print(f"{args.x} * {args.y} = {multiply(args.x, args.y)}")
    elif args.operation == "divide":
        print(f"{args.x} / {args.y} = {divide(args.x, args.y)}")

if __name__ == "__main__":
    main()
