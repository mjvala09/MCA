


# Load the "dplyr" package and display its loaded status.
if ("dplyr" %in% installed.packages()) {
  message("dplyr is loaded.")
} else {
  message("dplyr is not loaded.")
}

#Check the search path to see if the "ggplot2" package is available.
if ("ggplot2" %in% search()) {
  message("ggplot2 is available.")
} else {
  message("ggplot2 is not available.")
}

==========================================================================================


#Install the "tidyverse" package if it is not already installed.
install.packages("tidyverse")

# Check the installation status of the "ggplot2" package.
system.file(package='ggplot2')
========================================================================================


# Update the "dplyr" package to the latest version
update.packages("dplyr")


# Remove the "tidyverse" package from your R environment
remove.packages("dplyr")
======================================================================================
# get current system date
x=Sys.Date()
print(x)

date1 <- as.Date("2022/05/28")
date2 <- as.Date("2023/05/28")

diff.dt <- date2 -date1
print(diff.dt) 
=====================================================================================
data <- read.csv("C:/Users/Vinit/Desktop/R_Exersise_2/MData.csv")

# Extract specific columns and store them in separate variables
column1 <- data$Name
print(column1)
=====================================================================================
# Create example data frame
data <- data.frame(Name = c("Vinit", "Isha", "Yash"),
                   Age = c(21, 22, 20),
                   Designation = c("Developer", "CA", "Manager"))

# Save the data frame as a CSV file
write.csv(data, "MData.csv", row.names = FALSE)
=====================================================================================
# Install XML package if not already installed
# install.packages("XML")

# Load the XML package
library(XML)

# Read the XML file
xml_data <- xmlParse("data.xml")

# Extract specific information
# Example: Extract all text from <title> elements
title_nodes <- getNodeSet(xml_data, "//title")
titles <- sapply(title_nodes, xmlValue)

# Print the extracted information
print(titles)




# Install required packages if not already installed
# install.packages("xml2")
# install.packages("tidyverse")

# Load the required packages
library(xml2)
library(tidyverse)

# Read the XML file
xml_data <- read_xml("data.xml")

# Extract specific information from XML
data <- xml_data %>%
  xml_find_all("//item") %>%
  xml_attrs() %>%
  map_df(~set_names(as.list(.x), names(.x)))

# Display the resulting structure
str(data)
========================================================================
# Install jsonlite package if not already installed
# install.packages("jsonlite")

# Load the jsonlite package
library(jsonlite)

# # Read the JSON file into R
# json_data <- fromJSON("C:/Users/Vinit/Desktop/R_Exersise_2/data.json")

# # Extract specific data elements
# element3 <- json_data$element3
# element4 <- json_data$element4

# # Print the extracted elements
# print(element3)
# print(element4)


JsonData <- fromJSON(file = "C:/Users/Vinit/Desktop/R_Exersise_2/data.json")
print(JsonData)


# jsonData_to_DataFrame <- as.data.frame(JsonData)
=========================================================================
# R10. Creating a Histogram:
  # a. Generate a histogram of a given numeric variable from a data frame.
  # b. Customize the histogram by adding labels, titles, and adjusting the bin width.

df = data.frame(
  Id = 1 : 20,
  Age = rnorm(20, 30, 10)
)

hist(
  df$Age,
  main = "Histogram of Age",
  xlab = "Age",
  ylab = "Frequency",
  breaks = 12
)    
===========================================================================
# R11. Creating a Boxplot:
  # a. Create a boxplot to visualize the distribution of a numeric variable.
  # b. Add labels and customize the appearance of the boxplot.
df = data.frame(
  Id = 1 : 20,
  Age = rnorm(20, 30, 10)
)

boxplot(
  df$Age,
  main = "Box Plot of Age",
  xlab = "Variable",
  ylab = "Age",
  notch = TRUE,
  medcol = "cyan",
  axes = FALSE
)
===============================================================================
# R12. Creating a Bar Chart:
  # a. Create a bar chart to compare categorical variables in a data frame.
  # b. Customize the colors, labels, and appearance of the bar chart.


df <- data.frame(
  Category = c('A', 'B', 'C', 'D'),
  Freq = c(10, 25, 20, 5)
)

barplot(height = df$Freq,
        names.arg = df$Category,
        main = "Bar Chart of Categories",
        xlab = "Category",
        ylab = "Frequency",
        col = "skyblue",
        border = "darkblue"
)
===============================================================================
library(ggplot2)

# Create example data frame
data <- data.frame(Variable = c(10, 15, 8, 12, 9, 6))

# Create histogram
ggplot(data, aes(x = Variable)) +
  geom_histogram(binwidth = 1, fill = "steelblue", color = "black") +
  labs(title = "Histogram of Numeric Variable",
       x = "Variable",
       y = "Frequency") +
  theme_minimal()
===============================================================================
# Create example data
x <- c(1, 2, 3, 4, 5)
y <- c(3, 5, 6, 8, 10)

# Create scatterplot
plot(x, y, main = "Scatterplot", xlab = "X", ylab = "Y", pch = 16, col = "red")
==============================================================================
# Function to check if a number is positive or negative
checkNumber <- function(num) {
  if (num > 0) {
    cat("The number", num, "is positive.")
  } else if (num < 0) {
    cat("The number", num, "is negative.")
  } else {
    cat("The number is zero.")
  }
}

# Test the function with a sample number
number <- 5
checkNumber(number)
=====================================================================================
# Sample numeric vector
numbers <- c(-5, 10,-3, 7)

# Apply conditions using vectorized if-else
new_vector <- ifelse(numbers > 0, "Positive", ifelse(numbers < 0, "Negative", "Zero"))

# Print the new vector
print(new_vector)
===============================================================================
# Sample vector of categories
categories <- c("A", "B", "C", "D", "E")

# Apply conditions using switch()
new_vector <- switch(categories,
                    "A" = "Category A",
                    "B" = "Category B",
                    "C" = "Category C",
                    "D" = "Category D",
                    "Other Category")

# Print the new vector
print(new_vector)
=====================================================================================
my_vector <- c(1, 2, 3, 4, 5, 6)
# Create a matrix with 2 rows and 3 columns
my_matrix <- matrix(my_vector, nrow = 2, ncol = 3)
# Print the matrix
print(my_matrix)
================================================================================
# Define the dimensions of the array
length <- 3
width <- 3

# Create a three-dimensional array
array_3d <- array(0, dim = c(length, width))

# Access and modify elements in the array
array_3d[3, 2] <- 5  # Assigning a value of 5 to a specific element

# Print the array
print(array_3d)
=========================================================================

name<-readline(prompt = "Enter Your Name :")
age<-readline(prompt = "Enter Your Age : ")
print(name)
print(age)
# Open in R Studio

=========================================================
# Read the CSV file into R
data <- read.csv("C:/Users/Vinit/Desktop/R_Exersise_2/data.csv")

# Extract specific columns
columns <- c("name", "surname")
extracted_columns <- data[, columns]

# Extract specific rows
rows <- c(1)
extracted_rows <- data[rows, ]

# Print the extracted columns and rows
print(extracted_columns)
print(extracted_rows)
==========================================================
#Copy code
# Prompt the user to enter values
cat("Enter values (separated by spaces): ")

# Read input from the keyboard and store it in a vector
input_vector <- scan(n = 0, what = numeric())

# Print the input vector
print(input_vector)

=============================================================
# Read lines from a text file
lines <- readLines("C:/Users/Vinit/Desktop/R_Exersise_2/input.txt")

# Count the number of lines
num_lines <- length(lines)
cat("Number of lines:", num_lines, "\n")

# Search for specific pattern
# pattern <- "example"
# matching_lines <- grep(pattern, lines)

# Print the results
# cat("Matching lines with pattern '", pattern, "':\n")
# cat(lines[matching_lines], "\n")
================================================================
# Numeric value
value <- 3.12

# Format value with 2 decimal places
formatted_value <- format(value, nsmall = 4)

# Print the formatted value
print(formatted_value)


# Install and load the 'getPass' package
install.packages("getPass")
library(getPass)

# Prompt the user for a password
password <- getPass("Enter your password: ")

# Print the masked password
cat("Password entered:", password, "\n")
========================================================
# # Get the command line arguments
# args <- commandArgs(trailingOnly = TRUE)

# abc# Check if the correct number of arguments is provided
# if (length(args) != 2) {
#   stop("Usage: Rscript script.R <input_file> <output_file>")
# }

# # Retrieve the input and output file names
# input_file <- args[1]
# output_file <- args[2]

# # Perform operations on the files
# # Replace this with your desired operations
# # cat("Input file:", input_file, "\n")
# # cat("Output file:", output_file, "\n")

# # Read the input file
# data <- read.delim(input_file)

# # Perform operations on the data
# # Replace this with your desired operations on the data

# # Write the modified data to the output file
# write.csv(data, output_file, row.names = FALSE)

# # Print a success message
# cat("File", input_file, "processed. Output written to", output_file, "\n")


# Get the command line arguments
args <- commandArgs(trailingOnly = TRUE)

# Check if the correct number of arguments is provided
if (length(args) != 2) {
  stop("Usage: Rscript script.R <input_file> <output_file>")
}

# Retrieve the input and output file names
input_file <- args[1]
output_file <- args[2]

# Read the input file
data <- read.delim(input_file)

# Perform operations on the data
# Replace this with your desired operations on the data

# Write the modified data to the output file
write.table(data, output_file, row.names = FALSE)

# Print a success message
cat("File", input_file, "processed. Output written to", output_file, "\n")


======================the end=============================================.x