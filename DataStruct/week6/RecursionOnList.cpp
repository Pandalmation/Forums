#include <iostream>
using namespace std;

struct Node{
  int data;
  Node* next;
};

void ReversePrint (Node* ptr){
  if (ptr!= nullptr) {
      ReversePrint(ptr -> next);
      cout << ptr -> data << endl;
  }
}

int main(){
    Node* node1 = new Node;
    Node* node2 = new Node;
    Node* node3 = new Node;
    Node* node4 = new Node;

    node1 -> data = 777;
    node2 -> data = 888;
    node3 -> data = 999;
    node4 -> data = 1111;

    node1 -> next = node2;
    node2 -> next = node3;
    node3 -> next = node4;
    node4 -> next = NULL;

    ReversePrint(node1);
}
