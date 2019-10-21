void inorder(Node* root){
    if(root){
        inorder(root->left);
        v.push_back(root->data);
        inorder(root->right);
    }
}
bool isBST(Node* root) {
    inorder(root);
    vector<int> bst = v;
    v.clear();
    return is_sorted(bst.begin(), bst.end());
}
