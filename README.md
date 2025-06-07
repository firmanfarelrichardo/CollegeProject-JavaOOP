# JAVA OOP
## USE BLUEJ

## Clone Repository ke Komputer Lokal
https://github.com/firmanfarelrichardo/CollegeProject-JavaOOP.git
cd CollegeProject-JavaOOP dan buka di BlueJ

## Buat Branch Sendiri untuk Fitur Masing-Masing
git checkout -b nama-branch
contoh : "git checkout -b fitur-login"

## Lakukan Perubahan & Commit
git add .
git commit -m "Komentar"

## Push Branch ke GitHub
git push origin nama-branch
contoh : git push origin main 

## Hapus Branch (Opsional tapi Rapi)
git branch -d fitur-login         # Hapus branch lokal
git push origin --delete fitur-login   # Hapus branch di GitHub

## ⚠️ Tips Anti-Konflik
Selalu update branch main sebelum merge (pakai git pull)
Kalau branch lain masih "jadul", update dulu sebelum merge:
git checkout fitur-register
git merge main


## 🎯 RANGKUMAN JURUS CEPAT
Aksi	               Perintah Git
Pull dari main	       git pull origin main
Push ke main	       git push origin main
Pull dari branch	   git pull origin nama-branch
Push ke branch	       git push origin nama-branch
Buat branch baru	   git checkout -b nama-branch
Merge ke main	       git checkout main → git merge nama-branch
