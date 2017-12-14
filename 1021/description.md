### **1021 - Prerequisites?**<br/>
#### Description<br/>
Freddie has chosen to take **k** courses. To meet the degree requirements, he must take courses from each of several categories. Can you assure Freddie that he will graduate, based on his course selection?
#### Input specification<br/>
Input consists of several test cases (no more than 50). For each case, the first line of input contains **1 <= k <= 100**, the number of courses Freddie has chosen, and **0 <= m <= 100**, the number of categories. One or more lines follow containing **k** 4-digit integers follow; each is the number of a course selected by Freddie. Each category is represented by a line containing **1 <= c <= 100**, the number of courses in the category, **0 <= r <= c**, the minimum number of courses from the category that must be taken, and the **c** course numbers in the category. Each course number is a 4-digit integer. The same course may fulfil several category requirements. Freddie's selections, and the course numbers in any particular category, are distinct. A line containing 0 follows the last test case.
#### Output specification<br/>
For each test case, output a line containing "yes" if Freddie's course selection meets the degree requirements; otherwise output "no".
#### Sample Input<br/>
`3 2`<br/>
`0123 9876 2222`<br/>
`2 1 8888 2222`<br/>
`3 2 9876 2222 7654`<br/>
`3 2`<br/>
`0123 9876 2222`<br/>
`2 2 8888 2222`<br/>
`3 2 7654 9876 2222`<br/>
`0`<br/>
#### Sample Output<br/>
`yes`<br/>
`no`<br/>
<br/>
[Link to Problem](http://coj.uci.cu/24h/problem.xhtml?pid=1021)
