package com.shuai.demo.test;

public class Solution {
    public static void main(String[] args) {
        int[] height = {1,8,6,2,5,4,8,3,7};
        maxArea(height);
        maxAreaSecond(height);
    }




    public static int maxAreaSecond(int[] height) {
        //使用双指针，即左右两边同时移动
        int left = 0;
        int right = height.length-1;
        int area = 0;
        int result = 0;
        int minHeight = 0;

        while (left < right){
            minHeight = Math.min(height[right], height[left]);
            //获取面积
            area = (right-left)*minHeight;
            result = Math.max(area,result);
            //然后谁的值小就移动谁
            while (height[left]<= minHeight && left<right){
                left++;
            }
            while (height[right]<= minHeight && right>left){
                right--;
            }
        }
        System.out.println("使用双指针："+result);
        return result;
    }


    /**
     * 虽然成功有效，但是耗时过长
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        //定义一个变量，存放最多的水
        int area = 0;

        //遍历,获取两条垂线
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                area = Math.max(area,(j - i) * (Math.min(height[i], height[j])));
            }
        }
        System.out.println("最大的水容量为:"+area);
        return area;
    }
}
