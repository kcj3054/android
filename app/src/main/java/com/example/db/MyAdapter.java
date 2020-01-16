package com.example.db;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static  final int TEACHER = 0;
    private static  final int STUDENT = 1;

    private Context context;
    private List<People> peopleList;

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        if (viewType == STUDENT) {
            View view = layoutInflater.inflate(R.layout.item_student, parent, false );
            return new StudentViewHolder(view);
        }
        else if(viewType == TEACHER) {
            View view = layoutInflater.inflate(R.layout.item_teacher, parent, false);
            return  new TeacherViewHolder(view);
        }
        return null;
    }


    @Override
    public int getItemViewType(int position) {
        if (peopleList.get(position) instanceof Student)
            return STUDENT;
        else
            return TEACHER;
    }




    @Override
    public void onBindViewHolder( RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof  StudentViewHolder)
        {
            Student student = (Student) peopleList.get(position);
            ((StudentViewHolder) holder).textView1.setText(student.getName());
            ((StudentViewHolder) holder).textView2.setText(student.getName();
        }

    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }

    class TeacherViewHolder extends RecyclerView.ViewHolder {

        TextView textView1;
        TextView textView2;

        public TeacherViewHolder(@NonNull View itemView) {
            super(itemView);

            textView1 = itemView.findViewById(R.id.text1);
            textView2 = itemView.findViewById(R.id.text2);
        }
    }

    class StudentViewHolder extends RecyclerView.ViewHolder {

        TextView textView1;
        TextView textView2;

        public StudentViewHolder(@NonNull View itemView) {
            super(itemView);

            textView1 = itemView.findViewById(R.id.text1);
            textView2 = itemView.findViewById(R.id.text2);
        }
    }
}