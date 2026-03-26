from Operations import Operations

class Primes:

    def Primes(self):
        self.n = 0

    def set_n(self, n: int) -> None: 
        self.n = n
    
    def get_n(self) -> int:
        return self.n

    def prime1(self) -> bool:
        sw = False # Supuesto: el número es primo
        for i in range(2, self.n, 1):
            if self.n % i == 0:
                sw = True
        return sw
    
    def prime2(self) -> bool:
        sw = False # Supuesto: el número es primo
        i = 2
        while i < self.n / 2 and not sw:
            if self.n % i == 0:
                sw = True
            else: 
                i += 1
        return sw
    
    def prime3(self) -> bool:
        sw = False # Supuesto: el número es primo
        i = 2
        while i <= self.n ** (1 / 2) and not sw:
            if self.n % i == 0:
                sw = True
            else: 
                i += 1
        return sw
    
    def prime4(self) -> bool:
        sw = False # Supuesto: el número es primo
        if self.n % 2 == 0:
           sw = True
        else:
            i = 3
            while i <= self.n ** (1 / 2) and not sw:
                if self.n % i == 0:
                    sw = True
                else: 
                    i += 2
        return sw
    
    def new_prime_Euclides(self, P) -> int:
        obj_prod = Operations()
        x = obj_prod.product(P)
        y = x + 1
        d = 2
        while y % d != 0:
            d += 1
        return d
    
    def new_prime_without_Euclides(self, P) -> int:
        new_prime = max(P) + 1
        self.set_n(new_prime)
        while self.prime4():
            new_prime += 1
            self.set_n(new_prime)
        return new_prime



