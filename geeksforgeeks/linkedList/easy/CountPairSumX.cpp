int countPairs(struct Node* head1, struct Node* head2,	int x){
    struct Node* runner = head1;
    unordered_set<int> s;
    while(runner != NULL){
        s.insert(runner->data);
        runner = runner->next;
    }
    runner = head2;
    int count = 0;
    while(runner != NULL){
        if(s.find(x-runner->data) != s.end()) count += 1;
        runner = runner->next;
    }
    return count;
}
