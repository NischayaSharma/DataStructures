#include <stdio.h>
#include <stdlib.h>
void deleteAtBeginning();
void deleteAtEnd();
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
struct node *head = NULL;
int item, x, count = 1, total = 0;
int main()
{
    int n;
    while (n != 0)
    {
        printf("Enter\n1.Insert beginning \n2.Insert last\n3.Insert specific\n4.Delete beginning\n5.Delete end\n6.Delete specific\n7.Display\n0.Exit\n");
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
            deleteAtBeginning();
            break;
        case 5:
            deleteAtEnd();
            break;
        case 6:
            deleteAnElement();
            break;
        case 0:
            printf("Exit\n");
            break;
        case 7:
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
    printf("Enter item");
    scanf("%d", &item);
    temp->data = item;
    total++;
    if (head == NULL)
    {
        head = temp;
        head->prev = head;
        head->next = head;
    }
    else
    {
        temp->next = head;
        temp->prev = head->prev;
        head->prev->next = temp;
        head = temp;
    }
}
void insertAtEnd()
{
    struct node *temp = NULL;
    temp = (struct node *)malloc(sizeof(struct node));
    printf("Enter item");
    scanf("%d", &item);
    temp->data = item;
    total++;
    if (head == NULL)
    {
        head =  temp;
    }
    else
    {
        struct node *ptr = head;
        while(ptr->next!=head){
            ptr = ptr->next;
        }
    
    }
}
void display()
{
    struct node *ptr = head;
    while (ptr != NULL)
    {
        printf("%d ", ptr->data);
        ptr = ptr->next;
    }
}
void deleteAtBeginning()
{
    struct node *save = head;
    if (head == NULL)
    {
        printf("List empty\n");
        return;
    }
    else if (head->next == NULL)
    {
        head = NULL;
        last = NULL;
    }
    else
    {
        head = head->next;
        head->prev = NULL;
    }
    printf("Deleted item:%d", save->data);
    free(save);
    total--;
}
void deleteAtEnd()
{
    struct node *save = last;
    if (head == NULL)
    {
        printf("List empty\n");
        return;
    }
    else if (head->next == NULL)
    {
        head = NULL;
        last = NULL;
    }
    else
    {
        last = last->prev;
        last->next = NULL;
    }
    printf("Deleted item:%d", save->data);
    free(save);
    total--;
}
void insertAtMiddle()
{
    struct node *temp = (struct node *)malloc(sizeof(struct node));
    struct node *ptr = head;
    printf("Enter item and position\n");
    scanf("%d%d", &item, &x);
    temp->data = item;
    if (head == NULL)
    {
        head = temp;
        last = temp;
        total++;
    }
    else if (x < 1 || x > total + 1)
    {
        printf("Positions begin from 1 upto %d", total + 1);
    }
    else
    {
        if (x == 1)
        {
            temp->next = ptr;
            ptr->prev = temp;
            head = temp;
            total++;
        }
        else
        {
            while (count < x - 1)
            {
                ptr = ptr->next;
                count++;
            }
            temp->next = ptr->next;
            ptr->next = temp;
            temp->prev = ptr;
            total++;
        }
        if (temp->next == NULL)
        {
            last = temp;
        }
    }
}
void deleteAnElement()
{
    struct node *ptr = head;
    struct node *t = head;
    printf("Enter position");
    scanf("%d", &x);
    if (head == NULL)
    {
        printf("List empty");
    }
    else if (x < 1)
    {
        printf("Positions begin from 1");
    }
    else
    {
        if (x == 1)
        {
            t = t->next;
            t->prev = NULL;
            head = t;
            printf("Deleted item %d", ptr->data);
            free(ptr);
            total--;
        }
        else
        {
            while (count != x)
            {
                t = ptr;
                ptr = ptr->next;
                count++;
            }
            t->next = ptr->next;
            ptr->next->prev = ptr->prev;
            printf("Deleted item %d", ptr->data);
            free(ptr);
            total--;
        }
        if (t->next == NULL)
        {
            last = t;
        }
    }
}