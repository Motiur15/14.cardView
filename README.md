 Nearby Places Android App

A simple Android application that helps users quickly discover nearby places using an interactive CardView based UI.
Each card represents a category such as School, Restaurant, Airport, Hospital, Bus Stop, and Hotel. When the user taps a card, a new activity opens with information related to that place.

 ##Features

Clean CardView Grid Layout UI

6 Categories of Places

Clickable cards with ripple effect

Activity navigation using Intent

Simple and beginner-friendly Android project

## Categories Included

🏫 School

🍽️ Restaurant

✈️ Airport

🏥 Hospital

🚌 Bus Stop

🏨 Hotel

Each category opens a separate activity screen.

## Technologies Used

Java

Android Studio

XML Layout Design

CardView

Intent Navigation

## UI Design

Vertical LinearLayout structure

3 rows × 2 CardViews layout

Center aligned icons and titles

Material style ripple click effect

⚙️ How It Works

User opens the app.

A grid of place categories appears.

When the user taps a card:

An Intent is triggered.

A new activity opens related to the selected place.

Example logic:

if(view.getId()==R.id.schoolId)
{
    Intent intent=new Intent(MainActivity.this,schoolActivity.class);
    startActivity(intent);
}


## Purpose of the Project

This project is built for practicing:

CardView UI design

Android layout structuring

Click handling using OnClickListener

Activity navigation using Intent



👨‍💻 Author

Developed by Md.Motiur Rahman
Android Developer (Learning & Practice Project)
