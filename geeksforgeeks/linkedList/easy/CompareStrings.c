typedef struct Node* nodeptr;
int compare(struct Node*list1,struct Node*list2){
    if(!list1 && !list2) return 0;
    else if(!list2 || list1->c > list2->c) return 1;
    else if(!list1 || list2->c > list1->c) return -1;
    return compare(list1->next, list2->next);
}
