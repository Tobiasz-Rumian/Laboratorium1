/**
 * Created by Tobiasz Rumian on 06.10.2016.
 */
public class Zadanie9
{
    private static int ni1=0,ni=0;
    public Zadanie9(){}
    public static void show()
    {
        int i=1;
        ni=TryInputDialog.fromInt("Podaj n");
        System.out.println("----------");
        do
        {
            String string="";
            if(ni%2==0)
            {
                string="parzyste";
                ni1=ni/2;
            }
            else
            {
                string="nieparzyste";
                ni1=3*ni+1;
            }
            System.out.println(i+", "+ni+", "+string+", "+ni1);
            ni=ni1;
            i++;

        }while(ni1!=1);

    }
}
/* Ciąg wynikowy dla liczby 27 to:
1, 27, nieparzyste, 82
2, 82, parzyste, 41
3, 41, nieparzyste, 124
4, 124, parzyste, 62
5, 62, parzyste, 31
6, 31, nieparzyste, 94
7, 94, parzyste, 47
8, 47, nieparzyste, 142
9, 142, parzyste, 71
10, 71, nieparzyste, 214
11, 214, parzyste, 107
12, 107, nieparzyste, 322
13, 322, parzyste, 161
14, 161, nieparzyste, 484
15, 484, parzyste, 242
16, 242, parzyste, 121
17, 121, nieparzyste, 364
18, 364, parzyste, 182
19, 182, parzyste, 91
20, 91, nieparzyste, 274
21, 274, parzyste, 137
22, 137, nieparzyste, 412
23, 412, parzyste, 206
24, 206, parzyste, 103
25, 103, nieparzyste, 310
26, 310, parzyste, 155
27, 155, nieparzyste, 466
28, 466, parzyste, 233
29, 233, nieparzyste, 700
30, 700, parzyste, 350
31, 350, parzyste, 175
32, 175, nieparzyste, 526
33, 526, parzyste, 263
34, 263, nieparzyste, 790
35, 790, parzyste, 395
36, 395, nieparzyste, 1186
37, 1186, parzyste, 593
38, 593, nieparzyste, 1780
39, 1780, parzyste, 890
40, 890, parzyste, 445
41, 445, nieparzyste, 1336
42, 1336, parzyste, 668
43, 668, parzyste, 334
44, 334, parzyste, 167
45, 167, nieparzyste, 502
46, 502, parzyste, 251
47, 251, nieparzyste, 754
48, 754, parzyste, 377
49, 377, nieparzyste, 1132
50, 1132, parzyste, 566
51, 566, parzyste, 283
52, 283, nieparzyste, 850
53, 850, parzyste, 425
54, 425, nieparzyste, 1276
55, 1276, parzyste, 638
56, 638, parzyste, 319
57, 319, nieparzyste, 958
58, 958, parzyste, 479
59, 479, nieparzyste, 1438
60, 1438, parzyste, 719
61, 719, nieparzyste, 2158
62, 2158, parzyste, 1079
63, 1079, nieparzyste, 3238
64, 3238, parzyste, 1619
65, 1619, nieparzyste, 4858
66, 4858, parzyste, 2429
67, 2429, nieparzyste, 7288
68, 7288, parzyste, 3644
69, 3644, parzyste, 1822
70, 1822, parzyste, 911
71, 911, nieparzyste, 2734
72, 2734, parzyste, 1367
73, 1367, nieparzyste, 4102
74, 4102, parzyste, 2051
75, 2051, nieparzyste, 6154
76, 6154, parzyste, 3077
77, 3077, nieparzyste, 9232
78, 9232, parzyste, 4616
79, 4616, parzyste, 2308
80, 2308, parzyste, 1154
81, 1154, parzyste, 577
82, 577, nieparzyste, 1732
83, 1732, parzyste, 866
84, 866, parzyste, 433
85, 433, nieparzyste, 1300
86, 1300, parzyste, 650
87, 650, parzyste, 325
88, 325, nieparzyste, 976
89, 976, parzyste, 488
90, 488, parzyste, 244
91, 244, parzyste, 122
92, 122, parzyste, 61
93, 61, nieparzyste, 184
94, 184, parzyste, 92
95, 92, parzyste, 46
96, 46, parzyste, 23
97, 23, nieparzyste, 70
98, 70, parzyste, 35
99, 35, nieparzyste, 106
100, 106, parzyste, 53
101, 53, nieparzyste, 160
102, 160, parzyste, 80
103, 80, parzyste, 40
104, 40, parzyste, 20
105, 20, parzyste, 10
106, 10, parzyste, 5
107, 5, nieparzyste, 16
108, 16, parzyste, 8
109, 8, parzyste, 4
110, 4, parzyste, 2
111, 2, parzyste, 1*/
