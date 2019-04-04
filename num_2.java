/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(0);
        ListNode tmp = res;
        while(l1.next!=null && l2.next!=null){
            tmp.val += l1.val+l2.val;
            tmp.next = new ListNode((tmp.val)/10);
            tmp.val %= 10; 
            tmp = tmp.next;
            l1 = l1.next;
            l2 = l2.next;    
        }
        if(l1.next==null && l2.next==null){
            tmp.val += l1.val+l2.val;
            if(tmp.val/10 != 0){
                tmp.val %= 10;
                tmp.next = new ListNode(1);
                
            }
        }
        if(l1.next!=null && l2.next==null){
            tmp.val += l1.val+l2.val;
            if(tmp.val/10 != 0){
                if(l1.next.val == 9){
                    ListNode tmp2 = l1.next;
                    boolean flag = false;
                    while(tmp2.next != null)
                    {
                        if(tmp2.val != 9){
                            tmp2.val++;
                            flag = true;
                            break;
                            
                        }
                        else
                            tmp2.val = 0;
                            tmp2 = tmp2.next;
                    }
                    if(flag == false){
                        if(tmp2.val == 9){
                            tmp2.val = 0;
                            tmp2.next = new ListNode(1);
                        } else
                            tmp2.val ++;
                    }
                }
                else l1.next.val ++;
                tmp.val%=10;
            }
            tmp.next = l1.next;
        }
        if(l1.next==null && l2.next!=null){
            tmp.val += l1.val+l2.val;
            if(tmp.val/10 != 0){
                if(l2.next.val == 9){
                    ListNode tmp2 = l2.next;
                    boolean flag = false;
                    while(tmp2.next != null)
                    {
                        if(tmp2.val != 9){
                            tmp2.val++;
                            flag = true;
                            break;
                            
                        }
                        else
                            tmp2.val = 0;
                            tmp2 = tmp2.next;
                    }
                    if(flag == false){
                        if(tmp2.val == 9){
                            tmp2.val = 0;
                            tmp2.next = new ListNode(1);
                        } else
                            tmp2.val ++;
                    }
                }
                else l2.next.val ++;
                tmp.val%=10;
            }
            tmp.next =l2.next;
        }
        return res;
    }
}
