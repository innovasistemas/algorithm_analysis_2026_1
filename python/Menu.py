import time
from Primes import Primes

pr = Primes()
option = ""
while option != "0":
    print("Menú de opciones")
    print("1. Ingresar n")
    print("2. Valor n")
    print("3. primo1(n)")
    print("4. primo2(n)")
    print("5. primo3(n)")
    print("6. primo4(n)")
    option = input("Ingrese su opción: ")

    match option:
        case "0":
            print("Programa finalizado")
        case "1":
            pr.set_n(int(input("Ingrese n: ")))
        case "2":
            print(f"Valor actual de n: {pr.get_n()}")
        case "3":
            start = time.time()
            if pr.prime1():
                print(f"{pr.get_n()} no es primo")
            else:
                print(f"{pr.get_n()} es primo")
            end = time.time()
            print(f"Tiempo prime1(n): {end - start}")
        case "4":
            start = time.time()
            if pr.prime2():
                print(f"{pr.get_n()} no es primo")
            else:
                print(f"{pr.get_n()} es primo")
            end = time.time()
            print(f"Tiempo prime2(n): {end - start}")
        case "5":
            start = time.time()
            if pr.prime3():
                print(f"{pr.get_n()} no es primo")
            else:
                print(f"{pr.get_n()} es primo")
            end = time.time()
            print(f"Tiempo prime3(n): {end - start}")
        case "6":
            start = time.time()
            if pr.prime4():
                print(f"{pr.get_n()} no es primo")
            else:
                print(f"{pr.get_n()} es primo")
            end = time.time()
            print(f"Tiempo prime4(n): {end - start}")
        case _:
            print("Opción no válida")
