class Node:
    def __init__(self, data):
        self.data = data
        self.prev = None
        self.next = None

def create_linked_list():
    data = input("Введите элементы списка через пробел: ")
    data_list = data.split()
    head = Node(int(data_list[0]))
    cur_node = head
    for num in data_list[1:]:
        new_node = Node(int(num))
        cur_node.next = new_node
        new_node.prev = cur_node
        cur_node = new_node
    return head

def reverse_list(head):
    prev_node = None
    cur_node = head
    while cur_node:
        next_node = cur_node.next
        cur_node.next = prev_node
        cur_node.prev = next_node
        prev_node = cur_node
        cur_node = next_node
    return prev_node

def print_list(head):
    cur_node = head
    while cur_node:
        print(cur_node.data, end=" ")
        cur_node = cur_node.next
    print()

head = create_linked_list()

print("Исходный список:")
print_list(head)

head = reverse_list(head)

print("Развёрнутый список:")
print_list(head)