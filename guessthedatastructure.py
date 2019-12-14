from collections import deque
from sys import stdin
import heapq

class Stack:
    def __init__(self):
        self.s = deque()

    def add(self, n):
        self.s.append(n)

    def pop(self):
        return self.s.pop() if self.s else None
    
    def ds_type(self):
        return 'stack'

class Queue:
    def __init__(self):
        self.q = deque()

    def add(self, n):
        self.q.append(n)

    def pop(self):
        return self.q.popleft() if self.q else None

    def ds_type(self):
        return 'queue'

class PQ:
    def __init__(self):
        self.pq = []

    def add(self, n):
        heapq.heappush(self.pq, -n)

    def pop(self):
        return -heapq.heappop(self.pq) if self.pq else None

    def ds_type(self):
        return 'priority queue'


while 1:
    try:

        ds = [Stack(), Queue(), PQ()]
        for _ in range(int(input())):
            a, b = map(int, input().split())
            for i in range(len(ds) - 1, -1, -1):
                if a == 1:
                    ds[i].add(b)
                else:
                    if ds[i].pop() != b:
                        del ds[i]
        if len(ds)>1:
            print('not sure')
        elif len(ds) == 0:
            print('impossible')
        else:
            print(ds[0].ds_type())
        
    except EOFError:
        break


