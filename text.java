#include <iostream>

struct SinglyLinkedListNode {
    int data;
    SinglyLinkedListNode* next;
    SinglyLinkedListNode(int val) : data(val), next(nullptr) {}
};

SinglyLinkedListNode* deleteEven(SinglyLinkedListNode* listHead) {
    SinglyLinkedListNode* current = listHead;
    SinglyLinkedListNode* prev = nullptr;
    
    while (current != nullptr) {
        
        if (current->data % 2 == 0) {
            
            if (prev != nullptr) {
                prev->next = current->next;
                delete current;
                current = prev->next;
            } else {
                
                SinglyLinkedListNode* temp = current;
                listHead = current->next;
                delete temp;
                current = listHead;
            }
        } else {
            
            prev = current;
            current = current->next;
        }
    }

    return listHead;
}


void printLinkedList(SinglyLinkedListNode* head) {
    while (head != nullptr) {
        std::cout << head->data << " -> ";
        head = head->next;
    }
    std::cout << "nullptr" << std::endl;
}


int main() {
    SinglyLinkedListNode* head = new SinglyLinkedListNode(1);
    head->next = new SinglyLinkedListNode(4);
    head->next->next = new SinglyLinkedListNode(7);

    std::cout << "Original Linked List: ";
    printLinkedList(head);

    head = deleteEven(head);

    std::cout << "Modified Linked List: ";
    printLinkedList(head);


    while (head != nullptr) {
        SinglyLinkedListNode* temp = head;
        head = head->next;
        delete temp;
    }

    return 0;
}