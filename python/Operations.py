class Operations:
    # Constructor
    def __init__(self) -> None:
        pass

    def product(self, P) -> int:
        prod = 1
        for i in range(0, len(P), 1):
            prod *= P[i]
        return prod