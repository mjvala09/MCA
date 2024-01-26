# library(dplyr)
# sessionInfo()
# 
# system.file(package = "dplyr")
# ======================================
# if(!require(tidyverse)){
#   install.packages("tidyverse")
# }else{
#   print("its already installed")
# }
# ======================================
# install.packages("ggplot2")
# if("ggplot2" %in% rownames(installed.packages())){
#   print("package  is installed")
# }else{
#   print("not installed")
# }
# ======================================
# install.packages("tidyverse")
# update.packages("tidyverse")
# remove.packages("tidyverse")
# ======================================
# cd <- Sys.Date()
# print(cd)
# cd2 <- Sys.time()
# print(cd2)
# cd3 <- date()
# print(cd3)
# ======================================
date1 <- as.Date("2001-12-14")
date2 <- as.Date("2023-06-06")
dif <- difftime(date2,date1,units = "auto")
print(floor(dif))


c <- readline(prompt = "enter integer")
print(c)

library(XML)
c <- xmlTreeParse()

library(jsonlite)
c<-fromJSON()

library(readxl)
read_excel()










data <- c(1,2,3,1,2,3,1,2)

boxplot(data)