# JavaProjectPBO

## Clone Repository ke Komputer Lokal
git clone https://github.com/firmanfarelrichardo/JavaProjectPBO.git
cd JavaProjectPBO

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