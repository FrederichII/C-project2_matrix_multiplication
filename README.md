# C-project2_matrix_multiplication

#### 这是我的C/C++ 课程作业，目的是实现矩阵乘法，我目前只写了最朴素的方法（对应行和列作内积），复杂度为O（n^3）我还打算写一下Strassen算法和Winograd算法，复杂度为O（n^2.8）. 目前遇到的问题是主函数调用`naive_multiply()`时会报`segmentation fault` ，之前成功运行过几次，可以正确计算100 x 100的矩阵乘法，但不知怎么现在不行了。data文件夹里准备了几个.txt数据文件，以便调试。
