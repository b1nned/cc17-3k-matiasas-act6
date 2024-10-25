package com.example.a30daysofproductivity

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a30daysofproductivity.data.Artip
import com.example.a30daysofproductivity.view.ArtTipAdapter

class MainActivity : AppCompatActivity() {
    companion object {
        val Artips = listOf(
            Artip(1, "Set Clear Goals", R.drawable.mage1,
                "Define your short-term and long-term goals to create a roadmap for success."),
            Artip(2, "Prioritize Tasks", R.drawable.mage2,
                "Learn how to rank your tasks by importance and urgency to focus on what matters most."),
            Artip(3, "Time Blocking", R.drawable.mage3,
                "Allocate specific time slots for each activity to maximize focus and productivity."),
            Artip(4, "Avoid Multitasking", R.drawable.mage4,
                "Focus on one task at a time to improve efficiency and output quality."),
            Artip(5, "Practice the 2-Minute Rule", R.drawable.mage5,
                "If a task takes less than two minutes, do it immediately."),
            Artip(6, "Use a To-Do List", R.drawable.mage6,
                "Organize your day by writing down tasks and checking them off as you complete them."),
            Artip(7, "Declutter Your Workspace", R.drawable.mage7,
                "Create a clean, organized environment to minimize distractions and boost focus."),
            Artip(8, "Practice Mindfulness", R.drawable.mage8,
                "Stay present in the moment to improve concentration and reduce stress."),
            Artip(9, "Break Down Big Tasks", R.drawable.mage9,
                "Divide large projects into smaller, manageable steps to avoid feeling overwhelmed."),
            Artip(10, "Take Regular Breaks", R.drawable.mage10,
                "Refresh your mind and body by taking short breaks during your work sessions."),
            Artip(11, "Use the Pomodoro Technique", R.drawable.mage11,
                "Work in 25-minute intervals followed by short breaks to maintain focus and energy."),
            Artip(12, "Limit Distractions", R.drawable.mage12,
                "Identify and minimize distractions, such as social media, to stay on track."),
            Artip(13, "Start Your Day Early", R.drawable.mage13,
                "Waking up early gives you quiet, uninterrupted time to get important tasks done."),
            Artip(14, "Stay Hydrated", R.drawable.mage14,
                "Drinking enough water improves focus, energy, and overall productivity."),
            Artip(15, "Review Your Progress", R.drawable.mage15,
                "Regularly assess your accomplishments and adjust your strategies as needed."),
            Artip(16, "Embrace Positive Habits", R.drawable.mage16,
                "Incorporate small, beneficial habits into your daily routine to boost productivity."),
            Artip(17, "Delegate Tasks", R.drawable.mage17,
                "Learn to delegate less important tasks to free up time for priority work."),
            Artip(18, "Practice Gratitude", R.drawable.mage18,
                "Recognizing what you're thankful for can improve mood and motivation."),
            Artip(19, "Focus on Health and Fitness", R.drawable.mage19,
                "Exercise regularly and eat healthily to maintain physical and mental energy."),
            Artip(20, "Say No More Often", R.drawable.mage20,
                "Learn to say no to commitments that don't align with your goals or priorities."),
            Artip(21, "Limit Decision Fatigue", R.drawable.mage21,
                "Make fewer, smarter decisions by simplifying daily choices, like meal planning or wardrobe selection."),
            Artip(22, "Plan Tomorrow Tonight", R.drawable.mage22,
                "End each day by planning the next, setting clear tasks and goals for the morning."),
            Artip(23, "Simplify Your Tools", R.drawable.mage23,
                "Use only the apps and tools that truly help you stay productive, avoiding tech overload."),
            Artip(24, "Practice Active Listening", R.drawable.mage24,
                "Listen attentively in conversations to gain insights and respond more effectively."),
            Artip(25, "Create a Morning Routine", R.drawable.mage25,
                "A structured morning routine sets a productive tone for the entire day."),
            Artip(26, "Reflect and Journal", R.drawable.mage26,
                "Spend a few minutes each day reflecting on your thoughts and progress through journaling."),
            Artip(27, "Eliminate Perfectionism", R.drawable.mage27,
                "Accept that 'good enough' is often better than striving for perfection."),
            Artip(28, "Batch Similar Tasks", R.drawable.mage28,
                "Group similar tasks together to maintain momentum and avoid context switching."),
            Artip(29, "Set Boundaries", R.drawable.mage29,
                "Protect your time by setting boundaries for work and personal activities."),
            Artip(30, "Celebrate Your Wins", R.drawable.mage30,
                "Acknowledge and reward your progress, no matter how small, to stay motivated."),

        )
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ArtTipAdapter(Artips)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }
}