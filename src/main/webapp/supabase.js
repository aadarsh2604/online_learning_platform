import { createClient } from 'https://esm.sh/@supabase/supabase-js@2'

const SUPABASE_URL = 'https://lzyowiasbdsftpdbpmnj.supabase.co';
const SUPABASE_KEY = 'eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJzdXBhYmFzZSIsInJlZiI6Imx6eW93aWFzYmRzZnRwZGJwbW5qIiwicm9sZSI6ImFub24iLCJpYXQiOjE3MDc4ODg2ODYsImV4cCI6MjAyMzQ2NDY4Nn0.j49HWzh4yayAhsZVy74f4UoRGutNaB9cck57ys4dpwA';
const supabase = createClient(SUPABASE_URL, SUPABASE_KEY);
        
        
document.getElementById('register').addEventListener('click',async function sendOtp() {              
    const email=document.getElementById('email').value;
    const password=document.getElementById('password').value;
    const { data, error } = await supabase.auth.signUp({
    email: email,
    password: password,
    })
    alert('check your email to verify!');
 })