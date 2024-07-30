class Nodo:
    def __init__(self, valor=None):
        self.valor = valor  # Dato del nodo
        self.siguiente = None  # Referencia al siguiente nodo


class LinkedList:
    def __init__(self):
        self.cabeza = None  # Inicialmente, la lista está vacía

    def insertar_al_inicio(self, valor):
        nuevo_nodo = Nodo(valor)  # Crear un nuevo nodo
        nuevo_nodo.siguiente = self.cabeza  # Apuntar al antiguo primer nodo
        self.cabeza = nuevo_nodo  # La cabeza ahora es el nuevo nodo

    def insertar_al_final(self, valor):
        nuevo_nodo = Nodo(valor)  # Crear un nuevo nodo
        if not self.cabeza:
            self.cabeza = nuevo_nodo  # Si la lista está vacía, la cabeza es el nuevo nodo
            return
        nodo_actual = self.cabeza
        while nodo_actual.siguiente:  # Recorrer la lista hasta el final
            nodo_actual = nodo_actual.siguiente
        nodo_actual.siguiente = nuevo_nodo  # El último nodo apunta al nuevo nodo

    def imprimir_lista(self):
        nodo_actual = self.cabeza
        while nodo_actual:
            print(nodo_actual.valor, end=" -> ")
            nodo_actual = nodo_actual.siguiente
        print("None")

    def borrar_elemento(self):
        if self.cabeza is None:
            print("No hay elementos para borrar.")
            return
        self.cabeza = self.cabeza.siguiente

    def revertir(self):
        previo = None  # Inicialmente, el nodo previo es None
        nodo_actual = self.cabeza  # Comenzar desde la cabeza de la lista
        while nodo_actual:
            siguiente = nodo_actual.siguiente  # Guardar referencia al siguiente nodo
            nodo_actual.siguiente = previo  # Revertir el puntero del nodo actual
            previo = nodo_actual  # Mover el nodo previo al nodo actual
            nodo_actual = siguiente  # Mover al siguiente nodo en la lista
        self.cabeza = previo  # La cabeza ahora es el último nodo procesado


mi_lista = LinkedList()

# Inserto primer elemento:
mi_lista.insertar_al_inicio(1)
mi_lista.imprimir_lista()  # Salida: 1 -> None

# Inserto segundo elemento al inicio:
mi_lista.insertar_al_inicio(2)
mi_lista.imprimir_lista()  # Salida: 2 -> 1 -> None


# Inserto tercer elemento al inicio:
mi_lista.insertar_al_inicio(3)
mi_lista.imprimir_lista()  # Salida: 3 -> 2 -> 1 -> None

# Borro el primer elemento de la lista:
mi_lista.borrar_elemento()
mi_lista.imprimir_lista()  # Salida: 2 -> 1 -> None

# Inserto elemento al final de la lista:
mi_lista.insertar_al_final(4)
mi_lista.imprimir_lista()  # Salida: 2 -> 1 -> 4 -> None

# Revierto la lista:
mi_lista.revertir()
mi_lista.imprimir_lista()  # Salida: 4 -> 1 -> 2 -> None
