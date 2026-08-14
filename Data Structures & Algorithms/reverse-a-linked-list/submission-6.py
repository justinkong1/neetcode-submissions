# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next

# (head)0->(next)1
# 1->head

class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        next=None
        while head:
            tmp=head.next
            head.next=next
            next=head
            head=tmp
        return next