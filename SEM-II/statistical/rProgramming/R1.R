# num = c(1:5)
# print(num)
# colors = c("orange","black","darkgreen")
# print(colors)
# ele<-c(12,23,34,45,56,67,1,2,3,4,5)
# ele1 <- c(ele > 10)
# print(ele1)
# 
# mat = matrix(c(1,2,3,4,5,6), nrow = 2, ncol = 3)
# print(mat)
# 
# list_data <- list(c(1,2,3), c("manoj","ravi","uttam"), c(TRUE,TRUE,FALSE))
# print(list_data)
# 
# fdata <- factor(colors, labels = "low", "mediam", "high")
# print(fdata)
# 
# date <- Sys.Date()
# print(date)
# 
# complexVector <- c(1+2i, 3-4i, 5+6i)
# print(complexVector)
# 
# nullDemo <- NULL
# print(nullDemo)
# checkingNull <- as.null(nullDemo)
# print(checkingNull)
# 
# numericVector <- c(10,20,30)
# print(numericVector[2])
# 
# characterVector <- c("A","B","C")
# print(characterVector[1])
# 
# # ele is a logical vector in this script
# print(length(ele))
# 
# mat1 <- matrix(c(1,2,3,4,5,6,7,8,9),nrow = 3,ncol = 3)
# mat2 <- matrix(c(9,8,7,6,5,4,3,2,1),nrow = 3,ncol = 3)
# print(mat1+mat2)
# 
# lst <- list("java","python")
# lst[[length(lst)+1]] = "laravel"
# print(lst)
# 
# char <- c("one","two","three")
# print(toupper(char))
# 
# forMean <- c(1,2,3,4,5)
# print(mean(forMean))
# 
# today <- Sys.Date()
# stringToday <- format(today, format="%B %d %Y")
# print(stringToday)
# 
# one <- Re(1+2i + 2+1i)
# print(one)
# 
# lst = list(c(1,2,3,4,5))
# print(lst[[1]]<-NULL)
# ======================================================================












# ======================================================================
# # install.packages("dplyr")
# library(dplyr)
# library(tidyverse)
# sessionInfo()
if ("ggplot2" %in% rownames(installed.packages())) {
  print("ggplot2 is installed.")
} else {
  print("ggplot2 is not installed.")
}




# 
# current_date <- Sys.Date()
# print(cuurrent_date)