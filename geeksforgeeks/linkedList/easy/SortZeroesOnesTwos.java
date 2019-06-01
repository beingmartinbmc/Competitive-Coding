class GFG{
    public void linksort(Node head){
        int zeroes = 0, ones = 0, twos = 0;
        Node counter = head;
        while(counter != null){
            if(counter.value == 0) zeroes++;
            if(counter.value == 1) ones++;
            if(counter.value == 2) twos++;
            counter = counter.next;
        }
        Node temp = head;
        while(zeroes > 0 || ones > 0 || twos > 0){
            while(zeroes > 0){
                temp.value = 0;
                zeroes--;
                temp = temp.next;
            }
            while(ones > 0){
                temp.value = 1;
                ones--;
                temp = temp.next;
            }
            while(twos > 0){
                temp.value = 2;
                twos --;
                temp =temp.next;
            }
        }
    }
}
