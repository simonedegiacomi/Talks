import asyncio

async def download_file(file):
	print(f"Downloading file {file}")
	await asyncio.sleep(1)
	print("Download of file {file} completed")

files = ["file_1.txt", "file_2.txt", "file_3.txt"]

async def main():
	tasks = [download_file(file) for file in files]
	await asyncio.gather(*tasks)

asyncio.run(main())
print("All download completed")

