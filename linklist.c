#include <stdio.h>
#include <stdlib.h>

struct Node
{
    int data;
    struct Node *next;
};
void traversal(struct Node *ptr)
{
    while (ptr != NULL)
    {
        printf("Element:%d\n", ptr->data);
        ptr = ptr->next;
    }
}
struct node *insertion(struct Node *head, int data)
{
    struct Node *ptr;
    ptr = (struct Node *)malloc(sizeof(struct Node));
    ptr->data = data;
    ptr->next = head;
    head = ptr;
    return ptr;
}
struct node *insertion1(struct Node *head, int data, int index)
{
    struct Node *ptr;
    ptr = (struct Node *)malloc(sizeof(struct Node));
    struct Node *p = head;
    int i = 0;
    while (i != index - 1)
    {
        p = p->next;
        i++;
    }
    ptr->data = data;
    ptr->next = p->next;
    p->next = ptr;
    return head;
}
struct node *insertion2(struct Node *head, int data)
{
    struct Node *ptr;
    ptr = (struct Node *)malloc(sizeof(struct Node));
    struct Node *p = head;
    while (p->next != NULL)
    {
        p = p->next;
    }
    ptr->data = data;

    p->next = ptr;
    ptr->next = NULL;
    return head;
}
struct Node *insertion3(struct Node *head, struct Node *pre_node, int data)
{
    struct Node *ptr;
    ptr = (struct Node *)malloc(sizeof(struct Node));
    ptr->data = data;
    ptr->next = pre_node->next;
    pre_node->next = ptr;

    return head;
}
struct Node *deletion(struct Node *head)
{
    struct Node *ptr = head;
    head = head->next;
    free(ptr);
    return head;
}
struct Node *deletion1(struct Node *head, int index)
{
    struct Node *p = head;
    struct Node *q = head->next;
    for (int i = 0; i < index - 1; i++)
    {
        p = p->next;
        q = q->next;
    }
    p->next = q->next;
    free(q);

    return head;
}
struct Node*deletion2(struct Node* head)
{
    struct Node *p = head;
    struct Node*q=head->next;
    while(q->next != NULL){

       p= p->next;
       q= q->next;

    }
    p->next=q->next;
    free(q);
    return head;


    
};
struct Node *deletion3(struct Node* head,int data){
      struct Node *p = head;
    struct Node*q=head->next;
    while(q->data !=data && q->next!=NULL){
        p= p->next;
       q= q->next;

    }
    if(q->data==data){
    p->next=q->next;
    free(q);
    }
    return head;



}
//reverse 
struct Node*reverse(struct Node* head){
    struct Node *p;
    struct Node *f;
    struct Node *c;
    p=NULL;
    c=head;//Mistake made previously that c was made the next node of head.
    while(c!=NULL){
        f=c->next;
        c->next=p;
        p=c;
        c=f;
    }
    return p;
   



}




int main()
{
    struct Node *head;
    struct Node *second;
    struct Node *third;
    struct Node *ptr;
    struct Node *index;

    head = (struct Node *)malloc(sizeof(struct Node));
    second = (struct Node *)malloc(sizeof(struct Node));
    third = (struct Node *)malloc(sizeof(struct Node));
    ptr = (struct Node *)malloc(sizeof(struct Node));

    // Link head and second
    head->data = 6;
    head->next = second;
    // link second and third
    second->data = 21;
    second->next = third;
    // link third to null
    third->data = 44;
    third->next = NULL;
    index = reverse(head);
    traversal(index);
}