#include <stdio.h>
#include <stdlib.h>
void insertAtBeginning();
void insertAtEnd();
void display();
void insertAtMiddle();
void deleteAnElement();
struct node
{
    int data;
    struct node *prev;
    struct node *next;
};
struct node *firstNode = NULL;
int item, x, count = 1, total = 0;
int main()
{
    int n;
    while (n != 0)
    {
        printf("Enter\n1.Insert beginning \n2.Insert last\n3.Insert specific\n4.Delete specific\n5.Display\n0.Exit\n");
        scanf("%d", &n);
        switch (n)
        {
        case 1:
            insertAtBeginning();
            break;
        case 2:
            insertAtEnd();
            break;
        case 3:
            insertAtMiddle();
            break;
        case 4:
            deleteAnElement();
            break;
        case 0:
            printf("Exit\n");
            break;
        case 5:
            display();
            break;
        default:
            printf("Wrong input\n");
        }
    }
    return 0;
}
void insertAtBeginning()
{
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    printf("Enter item:\n");
    scanf("%d", &item);
    temp->data = item;
    if (firstNode == NULL)
    {
        firstNode = temp;
        firstNode->next = firstNode;
    }
    else
    {
        struct node *ptr = (struct node *)malloc(sizeof(struct node));
        while (ptr->next != firstNode)
            ptr = ptr->next;
        ptr->next = temp;
        temp->next = firstNode;
        firstNode = temp;
    }
}
void insertAtEnd()
{
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    printf("Enter item:\n");
    scanf("%d", &item);
    temp->data = item;
    if (firstNode == NULL)
    {
        firstNode = temp;
        firstNode->next = firstNode;
    }
    else
    {
        struct node *ptr = firstNode;
        while (ptr->next != firstNode)
            ptr = ptr->next;
        temp->next = ptr->next;
        ptr->next = temp;
    }
}
void insertAtMiddle()
{
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    struct node *ptr = firstNode;
    printf("Enter data and the item after which you want to add the data: \n");
    scanf("%d%d", &item, &x);
    temp->data = item;
    if (firstNode == NULL)
    {
        firstNode = temp;
        firstNode->next = firstNode;
    }
    else
    {
        while (ptr->data != x)
        {
            ptr = ptr->next;
        }
        temp->next = ptr->next;
        ptr->next = temp;
    }
}
void deleteAnElement()
{
    struct node *ptr = firstNode;
    printf("Enter item: \n");
    scanf("%d",&item);
    while (ptr->next->data != item)
        ptr = ptr->next;
    struct node *temp = ptr->next;
    ptr->next = temp->next;
    temp->next = NULL;
    if (temp == firstNode)
        firstNode = ptr->next;
}
void display()
{
    struct node *ptr = firstNode;
    while (ptr->next != firstNode)
    {
        printf("%d ", ptr->data);
        ptr = ptr->next;
    }
    printf("%d\n", ptr->data);
}
